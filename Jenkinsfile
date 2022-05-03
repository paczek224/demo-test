pipeline {

    agent any
     environment {
            JOB_NAME = 'sss'
            CC = 'clang'
            BUILD_TAG = sh 'echo ${JOB_NAME} ${BUILD_NUMBER}'
        }
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}