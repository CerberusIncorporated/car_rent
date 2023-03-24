package by.yukhnevich.carsharing.entity.user;

import java.time.LocalDateTime;
import java.util.Objects;

public class Document {
    private Long id;
    private UserDetails userDetails;
    private String hash;
    private String identifier;
    private LocalDateTime expirationDate;

    public Document(Long id, UserDetails userDetails, String hash, String identifier, LocalDateTime expirationDate) {
        this.id = id;
        this.userDetails = userDetails;
        this.hash = hash;
        this.identifier = identifier;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(id, document.id) && Objects.equals(userDetails, document.userDetails) && Objects.equals(hash, document.hash) && Objects.equals(identifier, document.identifier) && Objects.equals(expirationDate, document.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userDetails, hash, identifier, expirationDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("id=").append(id);
        sb.append(", userDetails=").append(userDetails);
        sb.append(", hash='").append(hash).append('\'');
        sb.append(", identifier='").append(identifier).append('\'');
        sb.append(", expirationDate=").append(expirationDate);
        sb.append('}');
        return sb.toString();
    }
}
