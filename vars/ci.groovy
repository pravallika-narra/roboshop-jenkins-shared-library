def call(){
    pipeline{
        agent{
            label 'ansible'
        }
        stages{
            stage('compile/build'){
                steps {
                    echo 'build'
                }
            }
            stage('unit tests'){
                steps {
                    echo 'unit tests'
                }
            }
        }
    }
}