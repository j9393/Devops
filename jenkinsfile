@Library('DevopsBuildLibrary') _

pipeline {
    agent any
    stages {
        stage ('Build') {
            steps { 
                script { 
                    buildtemplate 'dotnetframework'
                   
                }
            }
        }
    }
}
