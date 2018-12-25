car-rental-service


RentalService

      bookMyCar(String email, int vehicleId, Date pickupDate, Date returnDate){
         1- check if the customer is available in our system. (dummy logic to check);
         2- for given vehicleId, check all the booking made for vehicleId and check availability for requested pickup
         and return date;
         3- book the car for the email id;
      }
VehicleService

      VehicleBookingInfo :
            int vehicleId;
            Date pickupDate;
            Date returnDate;
      isAvailable(List<VehicleBookingInfo> list, Date pickupDate, Date returnDate){

      This method will check if the requested pickupDate and returnDate is available for the vehicleId;
       1- check if the requested pickup date is between any of the bookings made for the vehicleId;
       2- check if the requested return date is between any of the bookings made for the vehicleId;
       3- check if any of the booking lies between requested pickup and return date;
      }

