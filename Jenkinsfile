node {
    checkout scm

    stage("Clone") {
        git branch: 'master', url: 'https://github.com/Jd-Bob/siooka-admin-server.git'
    }

    stage("Build") {
        stage("java package") {
            sh "./mvnw clean install"
        }
        stage("java package") {
            sh "docker stop admin-server"
            sh "docker rmi admin-server"
        }
        stage("docker image") {
            def customImage = docker.build("admin-server", ".")
        }
    }

    stage("Continue Integration") {
        stage("Runing unit tests") {
            sh "./mvnw test -Punit"
        }
    }

    stage("Continue Deployment") {
        options {
            timeout(time: 10, unit: "SECONDS")
        }

        stage("Deployment") {
            sh "docker run -p 8084:8084 admin-server"
        }
    }
}
