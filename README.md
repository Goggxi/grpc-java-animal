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

### Client Streaming
```protobuf
    service AnimalService {
      // Client Streaming
      rpc setLongClasses(stream AnimalLongReq) returns (AnimalLongRes);
    }
```

### Bi-Directional Streaming
```protobuf
    service AnimalService {
      // BiDi Streaming
      rpc setClassesEveryone(stream AnimalEveryoneReq) returns (stream AnimalEveryoneRes);
    }
```

### Error Documentation
```protobuf
    service CalculatorService {
    // error handling
    // this RPC will throw an exception if the sent number is negative
    // The error being sent is of type INVALID_ARGUMENT
    rpc SquareRoot(SquareRootRequest) returns (SquareRootResponse) {};
    }
```