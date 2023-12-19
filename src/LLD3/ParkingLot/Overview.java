package LLD3.ParkingLot;

public class Overview {
    /**
     * 1.single / multilevel parking
     * 2.types of vehicles supported : 2w/4w
     * 3.dedicated parking spots for 2w/4w
     * 4.multiple entry / exit gates
     * 5.multiple parking spots on each floor
     *  -> availability
     *   -> park anywhere
     *   -> park at designated space
     *
     * 6.multiple ways to assign spot to vehicle
     *   but use only 1 at one time
     * 7.Restricted spots
     * 8.diff parking spot for diff vehicles
     * 9.diff facilities - ev charge at spot
     * 10.ticket is generated at entry, bill & payment happens at exit
     * 11.operator is present at each gate
     * 12.way of payment -> online/ cash
     * 13.system should store vehicle details
     *
     *
     * 1.fees calculation
     * 2.spot assignment
     *
     * fees calculation:- strategy dp
     *   -> flat fare calculation
     *   -> hourly fees calculation
     *
     * Payment:-
     * UPI
     * cash
     * cc/dc
     *    1.can part payment -> 70 UPI + 30 cash
     *   2. refunds
     *
     * how fees calculated  :-
     * FLAT            HOURLY
     * car: 20         car: 50
     * bike:10         bike:30
     *
     *
     * use case-diagram
     * class diagram
     *
     * parking lot
     * parking floor
     * parking spot
     * gates
     * vehicle
     * ticket
     * bill
     * operator
     * payment
     *
     *
     *
     * Parking lot:-
     * id
     * address
     * List<Floor>
     * List<Gate>
     *
     *
     * Parking floor:-
     * id
     * List<Parking Spot>
     * floor no
     *
     *
     * Gate:-
     * id
     * type
     * operator
     * status
     *
     * GateType:-
     * ENTRY
     * EXIT
     *
     * GateStatus:-
     * OPEN
     * CLOSED
     * MAINTAIN
     *
     * Parking Spot:-
     * id
     * spotType
     * status
     * no.
     * floor_id
     * meter_amount
     *
     *
     * VehicleType:-
     * 2W
     * 4W
     * 2WE
     * 4WE
     *
     * Status:-
     * EMPTY
     * FILLED
     * MAINTAIN
     *
     * EVSpot extends ParkingSpot:-
     * Meter
     *
     *
     * Meter:-
     * id
     * List<Consumption>
     *
     *
     * Consumption:-
     * id
     * start_unit
     * end_unit
     *
     *
     * Vehicle:-
     * id
     * reg_no
     * vehicle_type
     *
     *
     * Operator:-
     * id
     * name
     *
     *
     * Ticket:-
     * id
     * vehicle
     * entry_time
     * operator
     * spot
     * gate
     *
     * Bill:-
     * id
     * total_time
     * ticket
     * exit_time
     * gate
     * status
     * List<Payment>
     *
     * Ticket_Status:-
     * PAID
     * NOT_PAID
     * PENDING
     *
     * Payment:-
     * id
     * amount
     * MODE -> UPI,CASH
     * transaction_id
     * status
     *
     * Payment_status:-
     * SUCCESS
     * FAILED
     * PENDING
     *
     *
     *
     *
     * DESIGN pattern:-
     * 1.Strategy + factory
     *    fees/allocation
     *
     * 2.Builder for parking lot
     * 3.decorator for fees calculation
     *
     *
     *
     * 1.complete schema design
     *
     *  1. ParkingLot
     *  List<ParkingFloor>
     *  List<Gate></>
     *  int size
     *
     *  2. ParkingFloor
     *  List<ParkingSpot></>
     *  floor_no
     *
     *  3. ParkingSpot
     *  no.
     *  vehicleType
     *  spotStatus
     *  floor_id
     *
     *  4.Gate
     *  gateNo
     *  operator
     *  status
     *  gateType
     *
     *  5.Ticket
     *  spot
     *  entryTime
     *  vehicle
     *  gate
     *  operator
     *
     *
     *
     *  tables:-
     *  Parking_lot
     *  Parking_floor
     *  gates
     *  Parking_spot
     *  vehicles
     *  operators
     *  tickets
     *  bills
     *  payments
     *
     *
     *
     *
     *
     *  representing Inheritances:-
     *  Parking Spot -> ev Parking Spot
     *
     *  parking spot : id , vehicle, floor
     *  electronics parking spot : parking spot id, meter_amount
     *
     *
     * Enums:-
     *
     * ParkingSpotType{
     *     2W, 4W
     * }
     *
     *
     *
     * tables:-
     *
     * 1.parking_lots
     * id
     * size
     *
     * 2.parking_floors
     * id
     * floor_number
     *
     * 3.Gates
     * id
     * gate_number
     *
     * 4.parking_spot
     * id
     * floor_number
     * spot_number
     *
     * 5.vehicles
     * id
     * number
     * owner_name
     *
     * 6.operator
     * id
     * name
     * employee_id
     *
     * 7.tickets
     * id
     * entry_time
     * number
     *
     * 8.bills
     * id
     * exit_time
     * bill_amount
     *
     * 9.payments
     * id
     * time
     * amount
     * reference_no
     *
     * relations b/w other tables:-
     *
     * parking_lot <-> gates -> 1:M
     *
     * parking_lot <-> floor -> 1:M
     *
     * parking_lot <-> status -> M:1
     *
     * parking_floor <-> slots -> 1:M
     *
     * gate <-> GateType -> M:1
     *
     * gate <-> operator -> 1:1
     *
     * 
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
