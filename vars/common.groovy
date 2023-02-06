def compile(){
    if(app_lang=="nodejs"){
        sh 'npm install'
    }
    if(app_lang=="maven"){
        sh 'mvn package'
    }
}

def unittests(){
    if(app_lan=="nodejs")
    {
        try{
            sh 'npm test'
        }
        catch(Exception e)
        {
            email(email_note:"unit test failed")
        }
    }
    if(app_lang=="maven"){
        sh 'mvn test'
    }
}

def email(string email_note)
{
    mail bcc: '', body: 'TEST', cc: '', from: 'pravallikanarra99@gmail.com', replyTo: '', subject: 'TEST-JENKINS', to: 'pravallikanarra99@gmail.com'

}