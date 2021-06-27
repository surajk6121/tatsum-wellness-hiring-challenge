# tatsum-wellness-hiring-challenge

API Endpoints:

1. Get Areas:
    
    http://localhost:8080/areas (GET request)
    
    Example Response:
      [
        {
            "id": 1,
            "area": "Connection"
        },
        {
            "id": 2,
            "area": " Relationships"
        },
        {
           "id": 3,
           "area": " Career"
       },
        {
            "id": 4,
            "area": " Wealth"
        }
      ]
2. Add Ratings:
    
    http://localhost:8080/ratings (POST request)
    
    Request Body: #userid should be unique #rating should be in [1,5]
        {
          "userid": 34,                   
          "connectionRating": 5,          
          "relationshipsRating": 2,
          "careerRating": 3,
         "wealthRating": 2
        }
        
     Example response:
        
        Added ratings for userId: 34
        
3. Get all ratings
      
      http://localhost:8080/ratings   (GET request)
      
      Exaple response:
      
      [
          {
              "id": 5,
              "userid": 34,
              "connectionRating": 5,
              "relationshipsRating": 2,
              "careerRating": 3,
              "wealthRating": 2
          },
          {
              "id": 6,
              "userid": 41,
              "connectionRating": 5,
              "relationshipsRating": 4,
              "careerRating": 4,
              "wealthRating": 5
          },
          {
              "id": 7,
              "userid": 51,
              "connectionRating": 2,
              "relationshipsRating": 4,
              "careerRating": 3,
              "wealthRating": 5
          }
      ]
        
    
