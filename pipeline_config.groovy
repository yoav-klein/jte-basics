
libraries {
  merge=true
  sonar
  example {
    details {
    number = 2
    message = "Print this message #number times"
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