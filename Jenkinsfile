pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Building the project with maven compile'
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing the project with maven test'
                mvn 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }

        }

        stage('Deploy') {
            steps {
                echo ('Deploying the project with maven package')
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}