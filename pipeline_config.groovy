allow_scm_jenkinsfile = true

libraries {
  merge=true
  post
  sonar
  artifactory
  example {
    details {
    number = 2
    messages = ["First message", "Second message", "Third message"]
    }
  }
}

application_environments {
  dev {
    long_name = "Devlopmento" 
  }
  prod {
    long_name = "Productionzio"
  }
}
