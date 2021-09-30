# Vault Test

A very small project to test spring cloud vault.

1. Install vault locally: https://learn.hashicorp.com/tutorials/vault/getting-started-install?in=vault/getting-started
2. In a new terminal, start in dev mode `vault server -dev`
3. Copy the file `src/main/resources/bootstrap.yml.template` to `src/main/resources/bootstrap.yml` and replace the token
   placeholder with the root token printed by the vault server.
4. In a new terminal, insert a secret (use the root taken printed by the vault server):
   ```bash
   export VAULT_ADDR='http://127.0.0.1:8200' 
   export VAULT_TOKEN='<root token>'
   vault kv put secret/application foo=world excited=yes
   ```
5. Run the tests: `./mvnw clean test`
