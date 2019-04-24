# Getting started with Vault, Spring Cloud Vault and Spring Boot

Run Vault inside a container: docker run --name=dev-vault -d --cap-add=IPC_LOCK -e 'VAULT_DEV_ROOT_TOKEN_ID=myroot' -e 'VAULT_TOKEN=myroot' -e 'VAULT_DEV_LISTEN_ADDRESS=0.0.0.0:8200' -e 'VAULT_ADDR=http://127.0.0.1:8200' -p 8200:8200 vault:0.9.6

Create a secret: docker exec -it dev-vault vault write secret/spring-vault-sample password=H@rdT0Gu3ss
