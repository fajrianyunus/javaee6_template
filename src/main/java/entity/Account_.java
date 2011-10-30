package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-10-30T22:02:45.552+0800")
@StaticMetamodel(Account.class)
public class Account_ {
	public static volatile SingularAttribute<Account, Long> id;
	public static volatile SingularAttribute<Account, Boolean> active;
	public static volatile SingularAttribute<Account, String> password;
	public static volatile SingularAttribute<Account, String> username;
}
