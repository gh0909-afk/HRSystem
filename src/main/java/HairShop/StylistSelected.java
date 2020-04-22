package HairShop;

public class StylistSelected extends AbstractEvent {

    private Long id;
    private Integer stylistId;
    private String stylistName;

    public StylistSelected(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getStylistId() {
        return stylistId;
    }

    public void setStylistId(Integer stylistId) {
        this.stylistId = stylistId;
    }
    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }
}
