import subprocess
subprocess.run(["docker", "build", "--build-arg", "JAR_FILE=build/libs/*.jar", "-t", "dockerfun-dockerimage-1", "."])