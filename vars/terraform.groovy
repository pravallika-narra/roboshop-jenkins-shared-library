def call(){
    pipeline{
        agent{
            node{
                label "workstation"
            }
        }
        parameters{
            string(name:'INFRA_ENV',default_value:'',description:'enter proper environment')
        }
        stages{
            stage('Terraform-init')
                    {
                        steps{
                            sh "terraform init -backend-config=env-${INFRA_ENV}/state.tfvars"
                        }
                    }
        }
    }
}