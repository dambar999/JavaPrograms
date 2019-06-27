package Spring;

import javax.xml.ws.Provider;

public class SpringScopes {
	 @Autowired
	  private Provider<PrototypeBean>myPrototypeBeanprovider;
	   PrototypeBean getProtoTypeBean() {
		return myPrototypeBeanprovider.get();
	}
	//We use Provider interface to inject the prototype bean. For each getPrototypeInstance() method call,
	//the myPrototypeBeanProvider.get() method returns a new instance of PrototypeBean
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Provider<Prototypebean>provider
		
		PrototypeBean getPrototyprbean1() {
			provider.get
			
		}
	}

}
