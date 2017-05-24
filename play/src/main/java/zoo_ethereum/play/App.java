package zoo_ethereum.play;

import org.ethereum.crypto.ECKey;
import org.spongycastle.util.encoders.Hex;

/**
 * Hello world!
 * https://ethereum.stackexchange.com/questions/4264/how-to-create-an-account-in-ethereumj
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ECKey key = new ECKey();

		byte[] addr = key.getAddress();
		byte[] priv = key.getPrivKeyBytes();

		String addrBase16 = Hex.toHexString(addr);
		String privBase16 = Hex.toHexString(priv);

		System.out.println("Address     : " + addrBase16);
		System.out.println("Private Key : " + privBase16);
		
		// can be tested on: https://www.myetherwallet.com/#view-wallet-info
	}
}
