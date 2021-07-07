## gRPC on Java

### Unary RPC
```protobuf
    service AnimalService {
      // Unary
      rpc setClasses(AnimalReq) returns (AnimalRes);
    }
```