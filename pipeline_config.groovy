allow_scm_jenkinsfile = true

libraries {
  merge=true
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
