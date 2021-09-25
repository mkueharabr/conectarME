package br.com.kenji.conectarME.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="indices")
public class IndiceMunicipio {

	@Id
	@Column(name= "CO_MUNICIPIO")
	private int coMunicipio;

	@Column(name= "MUNICIPIO")
	private String municipio;

	@Column(name= "MICRORREGIAO_ID")
	private int microrregiaoId;

	@Column(name= "MICRORREGIAO_NOME")
	private String microrregiaoNome;

	@Column(name= "MICRORREGIAO_MESORREGIAO_ID")
	private int microrregiaoMesorregiaoId;

	@Column(name= "MICRORREGIAO_MESORREGIAO_NOME")
	private String microrregiaoMesorregiaoNome;

	@Column(name= "MICRORREGIAO_MESORREGIAO_UF_ID")
	private int microrregiaoMesorregiaoUfId;

	@Column(name= "MICRORREGIAO_MESORREGIAO_UF_SIGLA")
	private String microrregiaoMesorregiaoUfSigla;

	@Column(name= "MICRORREGIAO_MESORREGIAO_UF_NOME")
	private String microrregiaoMesorregiaoUfNome;

	@Column(name= "MICRORREGIAO_MESORREGIAO_UF_REGIAO_ID")
	private int microrregiaoMesorregiaoUfRegiaoId;

	@Column(name= "MICRORREGIAO_MESORREGIAO_UF_REGIAO_SIGLA")
	private String microrregiaoMesorregiaoUfRegiaoSigla;

	@Column(name= "MICRORREGIAO_MESORREGIAO_UF_REGIAO_NOME")
	private String microrregiaoMesorregiaoUfRegiaoNome;

	@Column(name= "area_municipio")
	private double areaMunicipio;

	@Column(name= "censo_ano_estimativa")
	private int censoAnoEstimativa;

	@Column(name= "censo_populacao_estimada")
	private int censoPopulacaoEstimada;

	@Column(name= "censo_2010_populacao")
	private int censo2010Populacao;

	@Column(name= "censo_2010_densidade_aprox")
	private double censo2010DensidadeAprox;

	@Column(name= "idh_municipio_ano")
	private int idhMunicipioAno;

	@Column(name= "idh_municipio_posicao_geral")
	private int idhMunicipioPosicaoGeral;

	@Column(name= "idh_municipio_idhm_geral")
	private double idhMunicipioIdhmGeral;

	@Column(name= "idh_municipio_posicao_renda")
	private int idhMunicipioPosicaoRenda;

	@Column(name= "idh_municipio_idhm_renda")
	private double idhMunicipioIdhmRenda;

	@Column(name= "idh_municipio_posicao_educacao")
	private int idhMunicipioPosicaoEducacao;

	@Column(name= "idh_municipio_idhm_educacao")
	private double idhMunicipioIdhmEducacao;

	@Column(name= "idh_municipio_posicao_longevidade")
	private int idhMunicipioPosicaoLongevidade;

	@Column(name= "idh_municipio_idhm_longevidade")
	private double idhMunicipioIdhmLongevidade;

	@Column(name= "idh_uf_ano")
	private int idhUfAno;

	@Column(name= "idh_uf_posicao_geral")
	private int idhUfPosicaoGeral;

	@Column(name= "idh_uf_idhm_geral")
	private double idhUfIdhmGeral;

	@Column(name= "idh_uf_idhm_renda")
	private double idhUfIdhmRenda;

	@Column(name= "idh_uf_idhm_longevidade")
	private double idhUfIdhmLongevidade;

	@Column(name= "idh_uf_idhm_educacao")
	private double idhUfIdhmEducacao;

	@Column(name= "pib_ano")
	private int pibAno;

	@Column(name= "pib_CO_REGIAO_RURAL")
	private int pibCoRegiaoRural;

	@Column(name= "pib_REGIAO_RURAL_NOME")
	private String pibRegiaoRuralNome;

	@Column(name= "pib_REGIAO_RURAL_NUCLEO")
	private String pibRegiaoRuralNucleo;

	@Column(name= "pib_AMAZONIA_LEGAL")
	private String pibAmazoniaLegal;

	@Column(name= "pib_SEMIARIDO")
	private String pibSemiarido;

	@Column(name= "pib_REGIAO_CIDADE_SP")
	private String pibRegiaoCidadeSp;

	@Column(name= "pib_VALOR_BRUTO_AGROPECUARIA")
	private double pibValorBrutoAgropecuaria;

	@Column(name= "pib_VALOR_BRUTO_INDUSTRIA")
	private double pibValorBrutoIndustria;

	@Column(name= "pib_VALOR_ADI_BRUTO_SERVICOS")
	private double pibValorAdiBrutoServicos;

	@Column(name= "pib_VALOR_ADI_BRUTO_ADM_DEFESA")
	private double pibValorAdiBrutoAdmDefesa;

	@Column(name= "pib_VALOR_ADI_BRUTO_TOTAL")
	private double pibValorAdiBrutoTotal;

	@Column(name= "pib_IMPOSTO_LIQ_SUBSIDIOS")
	private double pibImpostoLiqSubsidios;

	@Column(name= "pib_VALOR_PIB")
	private double pibValorPib;

	@Column(name= "pib_VALOR_PIB_PER_CAPITA")
	private double pibValorPibPerCapita;

	@Column(name= "pib_ATIVIDADE_MAIOR_VALOR_BRUTO")
	private String pibAtividadeMaiorValorBruto;

	@Column(name= "pib_ATIVIDADE_SEG_VALOR_BRUTO")
	private String pibAtividadeSegValorBruto;

	@Column(name= "pib_ATIVIDADE_TERC_VALOR_BRUTO")
	private String pibAtividadeTercValorBruto;

	@Column(name= "cce_unidades_locais")
	private int cceUnidadesLocais;

	@Column(name= "cce_pessoal_ocupado_assalariado")
	private int ccePessoalOcupadoAssalariado;

	@Column(name= "cce_pessoal_ocupado")
	private int ccePessoalOcupado;

	@Column(name= "cce_salarios_x_mil")
	private int cceSalariosXMil;

	@Column(name= "cce_media_salario_minimo")
	private double cceMediaSalarioMinimo;

	@Column(name= "censo2010_religiao_cat_apostolico_romano")
	private int censo2010ReligiaoCatApostolicoRomano;

	@Column(name= "censo2010_religiao_evangelica")
	private int censo2010ReligiaoEvangelica;

	@Column(name= "censo2010_religiao_espirita")
	private int censo2010ReligiaoEspirita;

	@Column(name= "censo2010_religiao_sem_ou_nao_declarada")
	private int censo2010ReligiaoSemOuNaoDeclarada;

	@Column(name= "ideb_ano")
	private int idebAno;

	@Column(name= "ideb_anos_iniciais")
	private double idebAnosIniciais;

	@Column(name= "ideb_anos_finais")
	private double idebAnosFinais;

	public int getCoMunicipio() {
		return coMunicipio;
	}

	public void setCoMunicipio(int coMunicipio) {
		this.coMunicipio = coMunicipio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getMicrorregiaoId() {
		return microrregiaoId;
	}

	public void setMicrorregiaoId(int microrregiaoId) {
		this.microrregiaoId = microrregiaoId;
	}

	public String getMicrorregiaoNome() {
		return microrregiaoNome;
	}

	public void setMicrorregiaoNome(String microrregiaoNome) {
		this.microrregiaoNome = microrregiaoNome;
	}

	public int getMicrorregiaoMesorregiaoId() {
		return microrregiaoMesorregiaoId;
	}

	public void setMicrorregiaoMesorregiaoId(int microrregiaoMesorregiaoId) {
		this.microrregiaoMesorregiaoId = microrregiaoMesorregiaoId;
	}

	public String getMicrorregiaoMesorregiaoNome() {
		return microrregiaoMesorregiaoNome;
	}

	public void setMicrorregiaoMesorregiaoNome(String microrregiaoMesorregiaoNome) {
		this.microrregiaoMesorregiaoNome = microrregiaoMesorregiaoNome;
	}

	public int getMicrorregiaoMesorregiaoUfId() {
		return microrregiaoMesorregiaoUfId;
	}

	public void setMicrorregiaoMesorregiaoUfId(int microrregiaoMesorregiaoUfId) {
		this.microrregiaoMesorregiaoUfId = microrregiaoMesorregiaoUfId;
	}

	public String getMicrorregiaoMesorregiaoUfSigla() {
		return microrregiaoMesorregiaoUfSigla;
	}

	public void setMicrorregiaoMesorregiaoUfSigla(String microrregiaoMesorregiaoUfSigla) {
		this.microrregiaoMesorregiaoUfSigla = microrregiaoMesorregiaoUfSigla;
	}

	public String getMicrorregiaoMesorregiaoUfNome() {
		return microrregiaoMesorregiaoUfNome;
	}

	public void setMicrorregiaoMesorregiaoUfNome(String microrregiaoMesorregiaoUfNome) {
		this.microrregiaoMesorregiaoUfNome = microrregiaoMesorregiaoUfNome;
	}

	public int getMicrorregiaoMesorregiaoUfRegiaoId() {
		return microrregiaoMesorregiaoUfRegiaoId;
	}

	public void setMicrorregiaoMesorregiaoUfRegiaoId(int microrregiaoMesorregiaoUfRegiaoId) {
		this.microrregiaoMesorregiaoUfRegiaoId = microrregiaoMesorregiaoUfRegiaoId;
	}

	public String getMicrorregiaoMesorregiaoUfRegiaoSigla() {
		return microrregiaoMesorregiaoUfRegiaoSigla;
	}

	public void setMicrorregiaoMesorregiaoUfRegiaoSigla(String microrregiaoMesorregiaoUfRegiaoSigla) {
		this.microrregiaoMesorregiaoUfRegiaoSigla = microrregiaoMesorregiaoUfRegiaoSigla;
	}

	public String getMicrorregiaoMesorregiaoUfRegiaoNome() {
		return microrregiaoMesorregiaoUfRegiaoNome;
	}

	public void setMicrorregiaoMesorregiaoUfRegiaoNome(String microrregiaoMesorregiaoUfRegiaoNome) {
		this.microrregiaoMesorregiaoUfRegiaoNome = microrregiaoMesorregiaoUfRegiaoNome;
	}

	public double getAreaMunicipio() {
		return areaMunicipio;
	}

	public void setAreaMunicipio(double areaMunicipio) {
		this.areaMunicipio = areaMunicipio;
	}

	public int getCensoAnoEstimativa() {
		return censoAnoEstimativa;
	}

	public void setCensoAnoEstimativa(int censoAnoEstimativa) {
		this.censoAnoEstimativa = censoAnoEstimativa;
	}

	public int getCensoPopulacaoEstimada() {
		return censoPopulacaoEstimada;
	}

	public void setCensoPopulacaoEstimada(int censoPopulacaoEstimada) {
		this.censoPopulacaoEstimada = censoPopulacaoEstimada;
	}

	public int getCenso2010Populacao() {
		return censo2010Populacao;
	}

	public void setCenso2010Populacao(int censo2010Populacao) {
		this.censo2010Populacao = censo2010Populacao;
	}

	public double getCenso2010DensidadeAprox() {
		return censo2010DensidadeAprox;
	}

	public void setCenso2010DensidadeAprox(double censo2010DensidadeAprox) {
		this.censo2010DensidadeAprox = censo2010DensidadeAprox;
	}

	public int getIdhMunicipioAno() {
		return idhMunicipioAno;
	}

	public void setIdhMunicipioAno(int idhMunicipioAno) {
		this.idhMunicipioAno = idhMunicipioAno;
	}

	public int getIdhMunicipioPosicaoGeral() {
		return idhMunicipioPosicaoGeral;
	}

	public void setIdhMunicipioPosicaoGeral(int idhMunicipioPosicaoGeral) {
		this.idhMunicipioPosicaoGeral = idhMunicipioPosicaoGeral;
	}

	public double getIdhMunicipioIdhmGeral() {
		return idhMunicipioIdhmGeral;
	}

	public void setIdhMunicipioIdhmGeral(double idhMunicipioIdhmGeral) {
		this.idhMunicipioIdhmGeral = idhMunicipioIdhmGeral;
	}

	public int getIdhMunicipioPosicaoRenda() {
		return idhMunicipioPosicaoRenda;
	}

	public void setIdhMunicipioPosicaoRenda(int idhMunicipioPosicaoRenda) {
		this.idhMunicipioPosicaoRenda = idhMunicipioPosicaoRenda;
	}

	public double getIdhMunicipioIdhmRenda() {
		return idhMunicipioIdhmRenda;
	}

	public void setIdhMunicipioIdhmRenda(double idhMunicipioIdhmRenda) {
		this.idhMunicipioIdhmRenda = idhMunicipioIdhmRenda;
	}

	public int getIdhMunicipioPosicaoEducacao() {
		return idhMunicipioPosicaoEducacao;
	}

	public void setIdhMunicipioPosicaoEducacao(int idhMunicipioPosicaoEducacao) {
		this.idhMunicipioPosicaoEducacao = idhMunicipioPosicaoEducacao;
	}

	public double getIdhMunicipioIdhmEducacao() {
		return idhMunicipioIdhmEducacao;
	}

	public void setIdhMunicipioIdhmEducacao(double idhMunicipioIdhmEducacao) {
		this.idhMunicipioIdhmEducacao = idhMunicipioIdhmEducacao;
	}

	public int getIdhMunicipioPosicaoLongevidade() {
		return idhMunicipioPosicaoLongevidade;
	}

	public void setIdhMunicipioPosicaoLongevidade(int idhMunicipioPosicaoLongevidade) {
		this.idhMunicipioPosicaoLongevidade = idhMunicipioPosicaoLongevidade;
	}

	public double getIdhMunicipioIdhmLongevidade() {
		return idhMunicipioIdhmLongevidade;
	}

	public void setIdhMunicipioIdhmLongevidade(double idhMunicipioIdhmLongevidade) {
		this.idhMunicipioIdhmLongevidade = idhMunicipioIdhmLongevidade;
	}

	public int getIdhUfAno() {
		return idhUfAno;
	}

	public void setIdhUfAno(int idhUfAno) {
		this.idhUfAno = idhUfAno;
	}

	public int getIdhUfPosicaoGeral() {
		return idhUfPosicaoGeral;
	}

	public void setIdhUfPosicaoGeral(int idhUfPosicaoGeral) {
		this.idhUfPosicaoGeral = idhUfPosicaoGeral;
	}

	public double getIdhUfIdhmGeral() {
		return idhUfIdhmGeral;
	}

	public void setIdhUfIdhmGeral(double idhUfIdhmGeral) {
		this.idhUfIdhmGeral = idhUfIdhmGeral;
	}

	public double getIdhUfIdhmRenda() {
		return idhUfIdhmRenda;
	}

	public void setIdhUfIdhmRenda(double idhUfIdhmRenda) {
		this.idhUfIdhmRenda = idhUfIdhmRenda;
	}

	public double getIdhUfIdhmLongevidade() {
		return idhUfIdhmLongevidade;
	}

	public void setIdhUfIdhmLongevidade(double idhUfIdhmLongevidade) {
		this.idhUfIdhmLongevidade = idhUfIdhmLongevidade;
	}

	public double getIdhUfIdhmEducacao() {
		return idhUfIdhmEducacao;
	}

	public void setIdhUfIdhmEducacao(double idhUfIdhmEducacao) {
		this.idhUfIdhmEducacao = idhUfIdhmEducacao;
	}

	public int getPibAno() {
		return pibAno;
	}

	public void setPibAno(int pibAno) {
		this.pibAno = pibAno;
	}

	public int getPibCoRegiaoRural() {
		return pibCoRegiaoRural;
	}

	public void setPibCoRegiaoRural(int pibCoRegiaoRural) {
		this.pibCoRegiaoRural = pibCoRegiaoRural;
	}

	public String getPibRegiaoRuralNome() {
		return pibRegiaoRuralNome;
	}

	public void setPibRegiaoRuralNome(String pibRegiaoRuralNome) {
		this.pibRegiaoRuralNome = pibRegiaoRuralNome;
	}

	public String getPibRegiaoRuralNucleo() {
		return pibRegiaoRuralNucleo;
	}

	public void setPibRegiaoRuralNucleo(String pibRegiaoRuralNucleo) {
		this.pibRegiaoRuralNucleo = pibRegiaoRuralNucleo;
	}

	public String getPibAmazoniaLegal() {
		return pibAmazoniaLegal;
	}

	public void setPibAmazoniaLegal(String pibAmazoniaLegal) {
		this.pibAmazoniaLegal = pibAmazoniaLegal;
	}

	public String getPibSemiarido() {
		return pibSemiarido;
	}

	public void setPibSemiarido(String pibSemiarido) {
		this.pibSemiarido = pibSemiarido;
	}

	public String getPibRegiaoCidadeSp() {
		return pibRegiaoCidadeSp;
	}

	public void setPibRegiaoCidadeSp(String pibRegiaoCidadeSp) {
		this.pibRegiaoCidadeSp = pibRegiaoCidadeSp;
	}

	public double getPibValorBrutoAgropecuaria() {
		return pibValorBrutoAgropecuaria;
	}

	public void setPibValorBrutoAgropecuaria(double pibValorBrutoAgropecuaria) {
		this.pibValorBrutoAgropecuaria = pibValorBrutoAgropecuaria;
	}

	public double getPibValorBrutoIndustria() {
		return pibValorBrutoIndustria;
	}

	public void setPibValorBrutoIndustria(double pibValorBrutoIndustria) {
		this.pibValorBrutoIndustria = pibValorBrutoIndustria;
	}

	public double getPibValorAdiBrutoServicos() {
		return pibValorAdiBrutoServicos;
	}

	public void setPibValorAdiBrutoServicos(double pibValorAdiBrutoServicos) {
		this.pibValorAdiBrutoServicos = pibValorAdiBrutoServicos;
	}

	public double getPibValorAdiBrutoAdmDefesa() {
		return pibValorAdiBrutoAdmDefesa;
	}

	public void setPibValorAdiBrutoAdmDefesa(double pibValorAdiBrutoAdmDefesa) {
		this.pibValorAdiBrutoAdmDefesa = pibValorAdiBrutoAdmDefesa;
	}

	public double getPibValorAdiBrutoTotal() {
		return pibValorAdiBrutoTotal;
	}

	public void setPibValorAdiBrutoTotal(double pibValorAdiBrutoTotal) {
		this.pibValorAdiBrutoTotal = pibValorAdiBrutoTotal;
	}

	public double getPibImpostoLiqSubsidios() {
		return pibImpostoLiqSubsidios;
	}

	public void setPibImpostoLiqSubsidios(double pibImpostoLiqSubsidios) {
		this.pibImpostoLiqSubsidios = pibImpostoLiqSubsidios;
	}

	public double getPibValorPib() {
		return pibValorPib;
	}

	public void setPibValorPib(double pibValorPib) {
		this.pibValorPib = pibValorPib;
	}

	public double getPibValorPibPerCapita() {
		return pibValorPibPerCapita;
	}

	public void setPibValorPibPerCapita(double pibValorPibPerCapita) {
		this.pibValorPibPerCapita = pibValorPibPerCapita;
	}

	public String getPibAtividadeMaiorValorBruto() {
		return pibAtividadeMaiorValorBruto;
	}

	public void setPibAtividadeMaiorValorBruto(String pibAtividadeMaiorValorBruto) {
		this.pibAtividadeMaiorValorBruto = pibAtividadeMaiorValorBruto;
	}

	public String getPibAtividadeSegValorBruto() {
		return pibAtividadeSegValorBruto;
	}

	public void setPibAtividadeSegValorBruto(String pibAtividadeSegValorBruto) {
		this.pibAtividadeSegValorBruto = pibAtividadeSegValorBruto;
	}

	public String getPibAtividadeTercValorBruto() {
		return pibAtividadeTercValorBruto;
	}

	public void setPibAtividadeTercValorBruto(String pibAtividadeTercValorBruto) {
		this.pibAtividadeTercValorBruto = pibAtividadeTercValorBruto;
	}

	public int getCceUnidadesLocais() {
		return cceUnidadesLocais;
	}

	public void setCceUnidadesLocais(int cceUnidadesLocais) {
		this.cceUnidadesLocais = cceUnidadesLocais;
	}

	public int getCcePessoalOcupadoAssalariado() {
		return ccePessoalOcupadoAssalariado;
	}

	public void setCcePessoalOcupadoAssalariado(int ccePessoalOcupadoAssalariado) {
		this.ccePessoalOcupadoAssalariado = ccePessoalOcupadoAssalariado;
	}

	public int getCcePessoalOcupado() {
		return ccePessoalOcupado;
	}

	public void setCcePessoalOcupado(int ccePessoalOcupado) {
		this.ccePessoalOcupado = ccePessoalOcupado;
	}

	public int getCceSalariosXMil() {
		return cceSalariosXMil;
	}

	public void setCceSalariosXMil(int cceSalariosXMil) {
		this.cceSalariosXMil = cceSalariosXMil;
	}

	public double getCceMediaSalarioMinimo() {
		return cceMediaSalarioMinimo;
	}

	public void setCceMediaSalarioMinimo(double cceMediaSalarioMinimo) {
		this.cceMediaSalarioMinimo = cceMediaSalarioMinimo;
	}

	public int getCenso2010ReligiaoCatApostolicoRomano() {
		return censo2010ReligiaoCatApostolicoRomano;
	}

	public void setCenso2010ReligiaoCatApostolicoRomano(int censo2010ReligiaoCatApostolicoRomano) {
		this.censo2010ReligiaoCatApostolicoRomano = censo2010ReligiaoCatApostolicoRomano;
	}

	public int getCenso2010ReligiaoEvangelica() {
		return censo2010ReligiaoEvangelica;
	}

	public void setCenso2010ReligiaoEvangelica(int censo2010ReligiaoEvangelica) {
		this.censo2010ReligiaoEvangelica = censo2010ReligiaoEvangelica;
	}

	public int getCenso2010ReligiaoEspirita() {
		return censo2010ReligiaoEspirita;
	}

	public void setCenso2010ReligiaoEspirita(int censo2010ReligiaoEspirita) {
		this.censo2010ReligiaoEspirita = censo2010ReligiaoEspirita;
	}

	public int getCenso2010ReligiaoSemOuNaoDeclarada() {
		return censo2010ReligiaoSemOuNaoDeclarada;
	}

	public void setCenso2010ReligiaoSemOuNaoDeclarada(int censo2010ReligiaoSemOuNaoDeclarada) {
		this.censo2010ReligiaoSemOuNaoDeclarada = censo2010ReligiaoSemOuNaoDeclarada;
	}

	public int getIdebAno() {
		return idebAno;
	}

	public void setIdebAno(int idebAno) {
		this.idebAno = idebAno;
	}

	public double getIdebAnosIniciais() {
		return idebAnosIniciais;
	}

	public void setIdebAnosIniciais(double idebAnosIniciais) {
		this.idebAnosIniciais = idebAnosIniciais;
	}

	public double getIdebAnosFinais() {
		return idebAnosFinais;
	}

	public void setIdebAnosFinais(double idebAnosFinais) {
		this.idebAnosFinais = idebAnosFinais;
	}
	
	
	
	
}


