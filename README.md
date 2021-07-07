## gRPC on Java

### Unary RPC
```protobuf
    service AnimalService {
      // Unary
      rpc setClasses(AnimalReq) returns (AnimalRes);
    }
```

### Server Streaming
```protobuf
    service AnimalService {
      // Server Streaming
      rpc setManyTimesClasses(AnimalManyTimesReq) returns (stream AnimalManyTimesRes);
    }
```

### Server Streaming
```protobuf
    service AnimalService {
      // Client Streaming
      rpc setLongClasses(stream AnimalLongReq) returns (AnimalLongRes);
    }
```