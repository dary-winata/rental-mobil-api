# Rental Mobil API

## Base url
```
https://aej-d1t1.herokuapp.com/aej/1/
```

## Swagger-ui
```
https://aej-d1t1.herokuapp.com/aej/1/swagger-ui/index.html
```

## Table Endpoints
### User

| Name                       | Endpoint                                                    | Method   | Bearer token | Body and response                 |
|----------------------------|-------------------------------------------------------------|----------|--------------|-----------------------------------|
| Create User                | `/user`                                                     | `POST`   | no           | [example](#user---create-user)    |
| Get User By Id             | `/user/{id}`                                                | `GET`    | no           | [example](#user---get-user-by-id) |
| Get All User               | `/user`                                                     | `GET`    | no           | [example](#user---get-all-user)   |

### Transaksi
| Name              | Endpoint     | Method   | Bearer token | Body and response                         |
|-------------------|--------------|----------|--------------|-------------------------------------------|
| Create Transaksi  | `/transaksi` | `POST`   | no           | [example](#transaksi---create-transaksi)  |
| Get All Transaksi | `/transaksi` | `GET`    | no           | [example](#transaksi---get-all-transaksi) |

### Mobil
| Name           | Endpoint | Method | Bearer token | Body and response                 |
|----------------|----------|--------|--------------|-----------------------------------|
| Get All Mobils | `/mobil` | `GET`  | no           | [example](#mobil---get-all-mobil) |
| Create Mobil   | `/mobil` | `POST` | no           | [example](#mobil---create-mobil)  |

## User Examples
### User - Create User
```
POST /user
```

Body
```json
{
  "name": "string",
  "username": "string",
  "password": "string"
}
```

Response
```json
{
  "code": "string",
  "message": "string",
  "data": {
    "id": "string",
    "name": "string",
    "username": "string",
    "password": "string"
  }
}
```

### User - Get User By Id
```
GET /user
```

Response
```json
{
  "code": "string",
  "message": "string",
  "data": {
    "id": "string",
    "name": "string",
    "username": "string",
    "password": "string"
  }
}
```

### User - Get All User
```
GET /user/{id}
```

Response
```json
{
  "code": "string",
  "message": "string",
  "data": [
    {
      "id": "string",
      "name": "string",
      "username": "string",
      "password": "string"
    }
  ]
}
```

## Transaksi Examples
### Transaksi - Create Transaksi
```aidl
POST /transaksi
```

Body
```json
{
  "userId": "string",
  "waktuPengembalian": {
    "day": 0,
    "month": 0,
    "year": 0
  },
  "listMobil": [
    "string"
  ]
}
```

Request
```json
{
  "code": "string",
  "message": "string",
  "data": {
    "id": "string",
    "userId": "string",
    "waktuPinjam": {
      "day": 0,
      "month": 0,
      "year": 0
    },
    "waktuPengembalian": {
      "day": 0,
      "month": 0,
      "year": 0
    },
    "listMobil": [
      "string"
    ],
    "createdAt": {
      "day": 0,
      "month": 0,
      "year": 0
    },
    "editedAt": {
      "day": 0,
      "month": 0,
      "year": 0
    }
  }
}
```

### Transaksi - Get All Transaksi
```aidl
GET /transaksi
```

Body
```json
{
  "code": "string",
  "message": "string",
  "data": [
    {
      "id": "string",
      "userId": "string",
      "waktuPinjam": {
        "day": 0,
        "month": 0,
        "year": 0
      },
      "waktuPengembalian": {
        "day": 0,
        "month": 0,
        "year": 0
      },
      "listMobil": [
        "string"
      ],
      "createdAt": {
        "day": 0,
        "month": 0,
        "year": 0
      },
      "editedAt": {
        "day": 0,
        "month": 0,
        "year": 0
      }
    }
  ]
}
```

## Mobil Example
### Mobil - Get All Mobil
```
GET /mobil
```

Body
```json
{
  "code": "200",
  "message": "berhasil",
  "data": [
    {
      "id": "3350cef7-736b-4fa1-a4cf-f45b83b93ebe",
      "name": "Mitsubishi Pajero Sport",
      "tipe": "suv",
      "tahun": "2022"
    },
    {
      "id": "72fbc7f7-500a-4075-be78-8d45f0a2fbea",
      "name": "BMW 2 Series Gran Coupe",
      "tipe": "coupe",
      "tahun": "2022"
    }
  ]
}
```

### Mobil - Create Mobil
```
POST /mobil
```

Body
```json
{
  "nama": "string",
  "tipe": "string",
  "tahun": "string"
}
```

Response
```json
{
  "code": "string",
  "message": "string",
  "data": {
    "id": "string",
    "name": "string",
    "tipe": "string",
    "tahun": "string"
  }
}
```