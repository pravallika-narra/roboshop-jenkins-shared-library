def call(){
    pipeline{
        agent{
            label 'workstation'
        }
        stages{
            stage('compile/build'){
                script {
                    common.compile
                }
            }
            stage('unit tests'){
                steps {
                    echo 'unit tests'
                }
            }
            stage('Quality control'){
                steps {
                    echo 'Quality control'
                }
            }
            stage('upload code to centralized place'){
                steps {
                    echo 'uploaded code'
                }
            }
        }
    }
}