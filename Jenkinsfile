pipeline {

    agent any

    stages {

        stage('Install Dependencies') {
            steps {
                dir('/home/utkarsh/flask-app') {
                    sh '''
                        python3 -m venv venv
                        venv/bin/pip install -r requirements.txt
                        venv/bin/pip install pytest
                    '''
                }
            }
        }

        stage('Test') {
            steps {
                dir('/home/utkarsh/flask-app') {
                    sh '''
                        venv/bin/pytest
                    '''
                }
            }
        }

        stage('Deploy') {
            steps {
                dir('/home/utkarsh/flask-app') {
                    sh '''
                        pkill -f "/home/utkarsh/flask-app/venv/bin/python /home/utkarsh/flask-app/app.py" || true

                        nohup /home/utkarsh/flask-app/venv/bin/python \
                            /home/utkarsh/flask-app/app.py \
                            > /home/utkarsh/flask-app/flask.log 2>&1 &
                    '''
                }
            }
        }
    }
}
