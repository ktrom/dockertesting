sudo docker save -o <tar-name>.tar <image-name>
sudo scp -i <.pem> /path/to/tar-file ubuntu@remote-host.com:<dir> to copy file
sudo ssh -i pem remote-host
sudo docker load -o <tar-name>.tar

(may need apache 2)
sudo docker -d -p 8080:8080 <image-name> 