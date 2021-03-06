package entities.yayin;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.Column;
import entities.yayin.Yay1nlar;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/**
 * The persistent class for the YAY1N_REZERVE database table.
 * 
 */
@Entity
@Table(name="YAY1N_REZERVE")
@NamedQuery(name = "getYay1nRezerveBykul1d", query = "SELECT y FROM Yay1nRezerve y WHERE y.kul1d = :kul1d AND  y.yynAlnacag1Tar >= :bugunTar ORDER BY y.rzv1slemTar DESC")
public class Yay1nRezerve implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RZV_1D")
	private int rzv1d;

	@Temporal( TemporalType.DATE)
	@Column(name="RZV_1SLEM_TAR")
	private Date rzv1slemTar;

	@Temporal( TemporalType.DATE)
	@Column(name="YYN_ALNACAG1_TAR")
	private Date yynAlnacag1Tar;

    @Temporal( TemporalType.DATE)
	@Column(name="YYN_GEL1S_TAR")
	private Date yynGel1sTar;

	@Column(name="KUL_1D")
	private int kul1d;

	@OneToOne
	@JoinColumn(name="YYN_1D")
	private Yay1nlar yyn1d;

	public Yay1nRezerve() {
    }

	public int getRzv1d() {
		return this.rzv1d;
	}

	public void setRzv1d(int rzv1d) {
		this.rzv1d = rzv1d;
	}

	public Date getRzv1slemTar() {
		return this.rzv1slemTar;
	}

	public void setRzv1slemTar(Date rzv1slemTar) {
		this.rzv1slemTar = rzv1slemTar;
	}

	public Date getYynAlnacag1Tar() {
		return this.yynAlnacag1Tar;
	}

	public void setYynAlnacag1Tar(Date yynAlnacag1Tar) {
		this.yynAlnacag1Tar = yynAlnacag1Tar;
	}

	public Date getYynGel1sTar() {
		return this.yynGel1sTar;
	}

	public void setYynGel1sTar(Date yynGel1sTar) {
		this.yynGel1sTar = yynGel1sTar;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rzv1d;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Yay1nRezerve)) {
			return false;
		}
		Yay1nRezerve other = (Yay1nRezerve) obj;
		if (rzv1d != other.rzv1d) {
			return false;
		}
		return true;
	}

	public int getKul1d() {
		return this.kul1d;
	}

	public void setKul1d(int kul1d) {
		this.kul1d = kul1d;
	}

	public Yay1nlar getYyn1d() {
		return this.yyn1d;
	}

	public void setYyn1d(Yay1nlar yyn1d) {
		this.yyn1d = yyn1d;
	}

}