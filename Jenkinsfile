pipeline {
    agent any

    environment {
        APP_NAME = 'my-app'
        ENVIRONMENT = 'staging'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out code for ${env.APP_NAME}..."
                // git branch: 'main', url: 'https://github.com/your-repo/project.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application...'
                // sh './gradlew build' or 'mvn clean package' or 'npm run build'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                // sh './gradlew test' or 'npm test'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying to ${env.ENVIRONMENT} environment..."
                // sh './deploy.sh'
            }
        }
    }

    post {
        always {
            cleanWs() // Cleans up the workspace after the run completes
        }
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the logs above for details.'
        }
    }
}