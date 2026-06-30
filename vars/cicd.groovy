def contdown(repo)
{
  git "http://github.com/IntelliqDevops/${repo}.git"
}
def contbuild()
{
  sh 'mvn package'
}
def contdeploy(jobname,ipadd,contextpath)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipadd}:/var/lib/tomcat10/webapps/testappfuc.war"
}
def conttest(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
