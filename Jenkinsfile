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
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        sh 'docker push bhavya28122251/scientific-calculator'
                    }
                }
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                script {
                    withEnv(["ANSIBLE_HOST_KEY_CHECKING=False"]) {
                        ansiblePlaybook(
                            playbook: 'deploy.yml',
                            inventory: 'inventory'
                        )
                    }
                }
            }
        }
    }
}
