package LLD3.BookMyShow;

public class Overview {
    /**
     * 1.Overview
     * 2.Requirement gathering
     * 3.class diagram
     * 4.schema design
     * 5.working code(spring boot)
     *
     *
     *
     * Requirement gathering:-
     * 1.user should be able to book the movie tickets
     * 2.users should be able to select the seats before booking
     * 3.users can at max book 10 seats in one tickets
     * 4.BMS supports multiple cities
     * 5.A cities will have multiple theaters
     * 6.A theater will have multiple screens/auditorium
     * each screen can run 1 movie at a time
     * 7.users book seats for a show
     * movie running in a theater at a particular time
     * 8.users should be able to see all movies running in a particular region
     * 9.users should be able to see all the shows of a movie
     * 10.No 2 users should be allowed to book the same seat for the same show
     * 11.price: An attribute eg:- show + seat Type
     *
     *
     * Price:  theater + time + movie + movie type(2D/3D)
     *
     *
     * Seat Type:-
     * Recliner
     * Platinum
     * Gold
     * Silver
     *
     *
     * Payment:- 3rd Party (Adapter design pattern)
     *
     * 13.users should be able to cancel the booking.
     * 14.Refunds
     * 15.for every movie, we will store its rating, casts, genre, duration, language
     * 16.movie can be released in multiple formats-> 2D/3D/IMAX
     * 17.each screen will have multiple seat types -> GOLD, SILVER, PLATINUM
     * 18.BMS owns the data (assumption)
     *
     *
     *
     *
     *
     * Class Diagram:-
     * find out all the nouns
     * visualization
     *
     * City
     * Theatres
     * Screens
     * Seat
     * Types
     *
     *
     *
     * City:-
     * id
     * name
     * List<Theatre>
     *
     *
     * Theatre:-
     * id
     * name
     * List<Screen>
     *
     *
     * Screen:-
     * id
     * name
     * List<Seat>
     * List<Features>
     *
     *
     * Feature:-
     * 2D
     * 3D
     * IMAX
     * 4D
     *
     *
     * Seat:-
     * id
     * number
     * SeatType
     * row
     * col
     *
     * Note:-every screen has a different layout
     *
     * Seat Type:-
     * GOLD
     * SILVER
     * PLATINUM
     *
     *
     * Status: show+seat -> mapping entity(relation)
     * ShowSeat
     * Show
     * Seat
     * Status
     *
     * User Journey:-
     * USER -> BMS -> BOOK show -> payment -> Ticket
     *
     *
     * Show:-
     * id
     * Movie
     * start_time
     * end_time
     * Screen
     * List<Features>
     *
     *
     * User:-
     * id
     * name
     * ph no
     * email
     * password
     *
     * Price:-
     * Show + SeatType
     *
     *
     * ShowSeatType:-
     * Show
     * SeatType
     * Price
     *
     *
     * Booking/Ticket:-
     * id
     * Show
     * List<ShowSeat>
     * User
     * Status
     * amount
     * timeStamp
     * List<Payment>
     *
     *
     * Status:-
     * IN_PROGRESS
     * CONFIRMED
     * CANCELLED
     *
     *
     * Ticket:-payment (partial payment)
     * 1000 -> 200 wallet + 800 Credit card
     *
     * 1000 -> Credit card
     * ticket cancelled
     * refund -> reversed payment
     *
     *
     * Payment:-
     * id
     * amount
     * reference_id
     * status
     * MODE of Payment -> CC, DC, UPI
     * Payment_GateWay -> razorPay, PayUMoney
     *
     *
     *
     *
     * how to handle concurrency ?
     *
     * select the product/seat -> summary/confirmation -> pay
     *
     *
     * approach 1:-
     * isolation level: serializable
     * 1.take a lock on all the rows that user is trying to book
     * 2.check the status if seats are available
     * 3.payment page -> pay, go back
     * 4.release the lock
     *
     * lock was there for the duration entire transaction
     *
     * approach 2:-
     * introduce a new show seat status as blocked and use this instead of DB lock
     * we will not keep the transaction running till the end of payment
     *
     * 1.check the seat status . if the status is available
     * 2.take a lock over the seat id's
     * only 1 transaction will be able to acquire the lock
     * 3.double check locking:-
     * check the status again if it is available
     * 4.change the seat status to be blocked
     * 5.release the lock
     * 6.payment -> pay -> blocked -> booked
     *           -> go back -> blocked -> available
     *
     *
     *  T1 acquire the lock
     *  again check the status
     *  change the status to blocked
     *  T1 releases the lock
     *  go the payment page(T1)
     *  if success blocked -> booked
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
