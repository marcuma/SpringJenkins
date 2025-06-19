pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Building the project with maven compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing the project with maven test'
            }
        }

        stage('Deploy') {
            steps {
                echo ('Deploying the project with maven package')
            }
        }
    }
}