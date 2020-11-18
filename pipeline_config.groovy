allow_scm_jenkinsfile = true
//artifacts_directory = "artifacts"

keywords {
  artifacts_directory = "artos" 
}

libraries {
  merge=true
  post
  sonar
  artifactory {
    source = "my_source.bin" 
  }
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
