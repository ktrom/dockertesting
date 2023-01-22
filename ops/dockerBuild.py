import subprocess
subprocess.run(["docker", "build", "--build-arg", "JAR_FILE=build/libs/DockerFun-0.0.1-SNAPSHOT.jar", "-t", "new-image-1", "."])