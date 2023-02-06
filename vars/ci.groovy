def call(){
    pipeline{
        agent{
            label 'workstation'
        }
        stages{
            stage('compile/build'){
                steps {
                    script {
                        common.compile()
                    }
                }
            }
            stage('unit tests'){
                steps {
                    script {
                        common.unittests()
                    }
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