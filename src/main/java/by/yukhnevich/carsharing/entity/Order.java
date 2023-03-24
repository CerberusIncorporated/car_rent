package by.yukhnevich.carsharing.entity;

import by.yukhnevich.carsharing.entity.car.Car;
import by.yukhnevich.carsharing.entity.status.OrderStatus;
import by.yukhnevich.carsharing.entity.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;
    @Column(name = "status_name")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "rejection_comment")
    private String rejectionComment;
    @Column(name = "return_comment")
    private String returnComment;

    public Order(Long id, User user, Car car, OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, String rejectionComment, String returnComment) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rejectionComment = rejectionComment;
        this.returnComment = returnComment;
    }

    public Order(Long id, User user, Car car, OrderStatus status, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Order() {
    }

    public Order(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getRejectionComment() {
        return rejectionComment;
    }

    public void setRejectionComment(String rejectionComment) {
        this.rejectionComment = rejectionComment;
    }

    public String getReturnComment() {
        return returnComment;
    }

    public void setReturnComment(String returnComment) {
        this.returnComment = returnComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(user, order.user) && Objects.equals(car, order.car) && status == order.status && Objects.equals(startDate, order.startDate) && Objects.equals(endDate, order.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, car, status, startDate, endDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", car=").append(car);
        sb.append(", status=").append(status);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", rejectionComment='").append(rejectionComment).append('\'');
        sb.append(", returnComment='").append(returnComment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
