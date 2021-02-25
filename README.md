## Spring-kotlin :book:

Project development with spring-boot and kotlin for study of language 

## 📌 Index
- ⚙ [Settings](#-settings)
- 💻 [Technologies](#-technologies)
- 🚀 [How to run](#-how-to-run)
---

## ⚙ Settings
  Install the wsl2 docker on windows. 
   - Tutorial used for installation of docker with wsl2: https://github.com/codeedu/wsl2-docker-quickstart
---

## 💻 Technologies
- Kotlin
- Spring Boot
- PostgreSQL
- Docker  
- Gradle
---
 
## 🚀 How to run
  ### Cloning repository
  https://github.com/wanderleimagri/spring-kotlin.git

  ### Accessing web project
  cd spring-kotlin
  
  ### Running web project (in the terminal)
    docker-compose up --build --force-recreate
    
  * docker-compose up = start all services and images defined in the .yml file
  * --build = builds images before starting container
  * --force-recreate = recreate containers even if their configuration and image haven't changed
  
  #### Get (all)
    http://localhost:8080/accounts
  
  #### Post
    http://localhost:8080/accounts
    body(json) = {
       "name":"Pedro",
       "document":"4"
    }
  
  #### Put
    http://localhost:8080/accounts/1
      body(json) = {
        "name":"wanderlei magri",
        "document":"1",
        "balance":"100"
      }
      
  #### Delete
    http://localhost:8080/accounts/2
  

