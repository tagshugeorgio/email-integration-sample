### Email Sample Application

#### Set Up Environment
**Email Server**
```bash
docker-compose up -d
```

**Application**
```bash
./mnvw spring-boot:run
```

#### Sample Req
POST http://localhost:12500/email/send
```json
{
  "receiver": "sample@tagbangers.co.jp",
  "content": "Do u wanna meet me again ?"
}
```

*Audit Email*
OPEN Browser at http://localhost:1080
to check if the email is configured appropriately