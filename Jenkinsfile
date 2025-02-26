pipeline {
    agent any
    triggers { 
      githubPush() 
   }
    environment {
        DOCKER_IMAGE_NAME = 'bhavya28122251/scientific-calculator'
        GITHUB_REPO_URL = 'https://github.com/bhavya28122251/SPE_Mini_Project.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                    sh 'docker tag calculator bhavya28122251/scientific-calculator'
                    sh 'docker push bhavya28122251/scientific-calculator'
                    }
                 }
            }
        }

   stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }

    }
}
