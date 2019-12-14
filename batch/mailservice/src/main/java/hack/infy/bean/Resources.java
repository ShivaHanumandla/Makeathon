package hack.infy.bean;

import org.springframework.stereotype.Component;


@Component
public class Resources {

    private Long ResourceId;
    private String name;
    private String contactNo;
    private String address;
    private Long id;

    public Long getResourceId() {
        return ResourceId;
    }

    public void setResourceId(Long resourceId) {
        ResourceId = resourceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
