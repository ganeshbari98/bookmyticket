pipeline {

    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '4', artifactNumToKeepStr: '4'))
    }

    tools {
        maven 'Maven 3.9.15'
    }

    stages {

        stage('Code Compilation') {
            steps {
                echo 'Starting Code Compilation...'
                sh 'mvn clean compile'
                echo 'Code Compilation Completed Successfully!!'
            }
        }

        stage('Code QA Execution') {
            steps {
                echo 'Running JUnit Test Cases...'
                sh 'mvn clean test'
                echo 'JUnit Test Cases Completed Successfully!!'
            }
        }

        stage('Code Package') {
            steps {
                echo 'Creating WAR Artifact...'
                sh 'mvn clean package'
                echo 'WAR Artifact Created Successfully!!'
            }
        }

    }
}