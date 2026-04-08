pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    environment {
        IMAGE_NAME = "sample-webapp"
        CONTAINER_NAME = "sample-webapp-container"
    }

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/YOUR_USERNAME/YOUR_REPO.git'
            }
        }

        stage('Build WAR') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t sample-webapp .'
            }
        }

        stage('Stop Old Container') {
            steps {
                bat 'docker stop sample-webapp-container || exit 0'
                bat 'docker rm sample-webapp-container || exit 0'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8087:8080 --name sample-webapp-container sample-webapp'
            }
        }
    }
}
