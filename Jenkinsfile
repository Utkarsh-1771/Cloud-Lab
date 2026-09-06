pipeline {
    agent any

    stages {

        stage('Install Dependencies') {
            steps {
                sh '''
                    python3 -m venv venv
                    venv/bin/pip install -r requirements.txt
                    venv/bin/pip install pytest
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                    venv/bin/pytest
                '''
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    pkill -f "python.*app.py" || true

                    export JENKINS_NODE_COOKIE=dontKillMe

                    nohup venv/bin/python \
                        app.py \
                        > flask.log 2>&1 \
                        < /dev/null &
                '''
            }
        }

        stage('Health Check') {
            steps {
                sh '''
                    sleep 2
                    curl --fail http://127.0.0.1:5000
                '''
            }
        }
    }
}
