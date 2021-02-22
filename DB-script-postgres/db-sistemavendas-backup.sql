--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.3

-- Started on 2021-02-21 12:08:23

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2972 (class 1262 OID 16393)
-- Name: sistemavendas; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE sistemavendas WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';


ALTER DATABASE sistemavendas OWNER TO postgres;

\connect sistemavendas

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2973 (class 0 OID 0)
-- Dependencies: 2972
-- Name: DATABASE sistemavendas; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE sistemavendas IS 'sistemas de vendas e compras';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 207 (class 1259 OID 16417)
-- Name: bairros; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bairros (
    id_bairro integer NOT NULL,
    nome_bairro character varying(50),
    id_cidade integer
);


ALTER TABLE public.bairros OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16415)
-- Name: bairros_id_bairro_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.bairros_id_bairro_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.bairros_id_bairro_seq OWNER TO postgres;

--
-- TOC entry 2974 (class 0 OID 0)
-- Dependencies: 206
-- Name: bairros_id_bairro_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.bairros_id_bairro_seq OWNED BY public.bairros.id_bairro;


--
-- TOC entry 205 (class 1259 OID 16404)
-- Name: cidades; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cidades (
    id_cidade integer NOT NULL,
    nome_cidades character varying(50),
    id_estado integer
);


ALTER TABLE public.cidades OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16402)
-- Name: cidades_id_cidade_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cidades_id_cidade_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cidades_id_cidade_seq OWNER TO postgres;

--
-- TOC entry 2975 (class 0 OID 0)
-- Dependencies: 204
-- Name: cidades_id_cidade_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cidades_id_cidade_seq OWNED BY public.cidades.id_cidade;


--
-- TOC entry 211 (class 1259 OID 16438)
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    id_cliente integer NOT NULL,
    nome_cliente character varying(50),
    endereco_cliente character varying(50),
    rg_cliente character varying(20),
    cpf_cliente character varying(20),
    id_bairro integer,
    id_cidade integer
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16436)
-- Name: clientes_id_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.clientes_id_cliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clientes_id_cliente_seq OWNER TO postgres;

--
-- TOC entry 2976 (class 0 OID 0)
-- Dependencies: 210
-- Name: clientes_id_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.clientes_id_cliente_seq OWNED BY public.clientes.id_cliente;


--
-- TOC entry 203 (class 1259 OID 16396)
-- Name: estados; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estados (
    id_estado integer NOT NULL,
    nome_estado character varying(50),
    sigla_estado character varying(2)
);


ALTER TABLE public.estados OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16394)
-- Name: estados_id_estado_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.estados_id_estado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.estados_id_estado_seq OWNER TO postgres;

--
-- TOC entry 2977 (class 0 OID 0)
-- Dependencies: 202
-- Name: estados_id_estado_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.estados_id_estado_seq OWNED BY public.estados.id_estado;


--
-- TOC entry 213 (class 1259 OID 16456)
-- Name: fornecedores; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.fornecedores (
    id_fornecedor integer NOT NULL,
    nome_fornecedor character varying(50),
    endereco_fornecedor character varying(50),
    id_bairro integer,
    cnpj_fornecedor character varying(30)
);


ALTER TABLE public.fornecedores OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 16454)
-- Name: fornecedores_id_fornecedor_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.fornecedores_id_fornecedor_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.fornecedores_id_fornecedor_seq OWNER TO postgres;

--
-- TOC entry 2978 (class 0 OID 0)
-- Dependencies: 212
-- Name: fornecedores_id_fornecedor_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.fornecedores_id_fornecedor_seq OWNED BY public.fornecedores.id_fornecedor;


--
-- TOC entry 219 (class 1259 OID 16519)
-- Name: itens_tel_cli; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.itens_tel_cli (
    id_cliente integer NOT NULL,
    id_tel integer NOT NULL
);


ALTER TABLE public.itens_tel_cli OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16504)
-- Name: itens_tel_forn; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.itens_tel_forn (
    id_tel integer NOT NULL,
    id_forn integer NOT NULL
);


ALTER TABLE public.itens_tel_forn OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16534)
-- Name: itens_venda_produto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.itens_venda_produto (
    id_venda integer NOT NULL,
    id_produto integer NOT NULL,
    quantidade_produto integer
);


ALTER TABLE public.itens_venda_produto OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 32959)
-- Name: login; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.login (
    id_login integer NOT NULL,
    nome_login character varying(50),
    senha_login character varying(255),
    permissao character varying(50),
    login character varying(50),
    salt_senha character varying(255)
);


ALTER TABLE public.login OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 32957)
-- Name: login_id_login_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.login_id_login_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.login_id_login_seq OWNER TO postgres;

--
-- TOC entry 2979 (class 0 OID 0)
-- Dependencies: 221
-- Name: login_id_login_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.login_id_login_seq OWNED BY public.login.id_login;


--
-- TOC entry 224 (class 1259 OID 49370)
-- Name: parcela_vendas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.parcela_vendas (
    id_parc_venda integer NOT NULL,
    cod_venda integer,
    valor_venda numeric,
    valor_total numeric,
    numero_parcela integer,
    valor_parce numeric,
    datavenc character varying(15),
    estado character varying(2)
);


ALTER TABLE public.parcela_vendas OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 49368)
-- Name: parcela_vendas_id_parc_venda_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.parcela_vendas_id_parc_venda_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.parcela_vendas_id_parc_venda_seq OWNER TO postgres;

--
-- TOC entry 2980 (class 0 OID 0)
-- Dependencies: 223
-- Name: parcela_vendas_id_parc_venda_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.parcela_vendas_id_parc_venda_seq OWNED BY public.parcela_vendas.id_parc_venda;


--
-- TOC entry 215 (class 1259 OID 16474)
-- Name: produtos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.produtos (
    id_produto integer NOT NULL,
    nome_produto character varying(50),
    preco_compra numeric,
    preco_venda numeric,
    quantidade integer,
    id_fornecedor integer
);


ALTER TABLE public.produtos OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16472)
-- Name: produtos_id_produto_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.produtos_id_produto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.produtos_id_produto_seq OWNER TO postgres;

--
-- TOC entry 2981 (class 0 OID 0)
-- Dependencies: 214
-- Name: produtos_id_produto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.produtos_id_produto_seq OWNED BY public.produtos.id_produto;


--
-- TOC entry 209 (class 1259 OID 16430)
-- Name: telefones; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.telefones (
    id_telefone integer NOT NULL,
    numero_tel character varying(22)
);


ALTER TABLE public.telefones OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16428)
-- Name: telefones_id_telefone_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.telefones_id_telefone_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.telefones_id_telefone_seq OWNER TO postgres;

--
-- TOC entry 2982 (class 0 OID 0)
-- Dependencies: 208
-- Name: telefones_id_telefone_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.telefones_id_telefone_seq OWNED BY public.telefones.id_telefone;


--
-- TOC entry 226 (class 1259 OID 57535)
-- Name: vencimento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vencimento (
    id_vencimento integer NOT NULL,
    datavenc character varying(20)
);


ALTER TABLE public.vencimento OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 57533)
-- Name: vencimento_id_vencimento_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vencimento_id_vencimento_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vencimento_id_vencimento_seq OWNER TO postgres;

--
-- TOC entry 2983 (class 0 OID 0)
-- Dependencies: 225
-- Name: vencimento_id_vencimento_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vencimento_id_vencimento_seq OWNED BY public.vencimento.id_vencimento;


--
-- TOC entry 217 (class 1259 OID 16490)
-- Name: vendas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vendas (
    id_venda integer NOT NULL,
    data_venda character varying(10),
    valor_venda numeric,
    id_cliente integer,
    tipo_pagamento character varying(50)
);


ALTER TABLE public.vendas OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16488)
-- Name: vendas_id_venda_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vendas_id_venda_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vendas_id_venda_seq OWNER TO postgres;

--
-- TOC entry 2984 (class 0 OID 0)
-- Dependencies: 216
-- Name: vendas_id_venda_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vendas_id_venda_seq OWNED BY public.vendas.id_venda;


--
-- TOC entry 2765 (class 2604 OID 16420)
-- Name: bairros id_bairro; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairros ALTER COLUMN id_bairro SET DEFAULT nextval('public.bairros_id_bairro_seq'::regclass);


--
-- TOC entry 2764 (class 2604 OID 16407)
-- Name: cidades id_cidade; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cidades ALTER COLUMN id_cidade SET DEFAULT nextval('public.cidades_id_cidade_seq'::regclass);


--
-- TOC entry 2767 (class 2604 OID 16441)
-- Name: clientes id_cliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes ALTER COLUMN id_cliente SET DEFAULT nextval('public.clientes_id_cliente_seq'::regclass);


--
-- TOC entry 2763 (class 2604 OID 16399)
-- Name: estados id_estado; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estados ALTER COLUMN id_estado SET DEFAULT nextval('public.estados_id_estado_seq'::regclass);


--
-- TOC entry 2768 (class 2604 OID 16459)
-- Name: fornecedores id_fornecedor; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fornecedores ALTER COLUMN id_fornecedor SET DEFAULT nextval('public.fornecedores_id_fornecedor_seq'::regclass);


--
-- TOC entry 2771 (class 2604 OID 32962)
-- Name: login id_login; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login ALTER COLUMN id_login SET DEFAULT nextval('public.login_id_login_seq'::regclass);


--
-- TOC entry 2772 (class 2604 OID 49373)
-- Name: parcela_vendas id_parc_venda; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.parcela_vendas ALTER COLUMN id_parc_venda SET DEFAULT nextval('public.parcela_vendas_id_parc_venda_seq'::regclass);


--
-- TOC entry 2769 (class 2604 OID 16477)
-- Name: produtos id_produto; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produtos ALTER COLUMN id_produto SET DEFAULT nextval('public.produtos_id_produto_seq'::regclass);


--
-- TOC entry 2766 (class 2604 OID 16433)
-- Name: telefones id_telefone; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.telefones ALTER COLUMN id_telefone SET DEFAULT nextval('public.telefones_id_telefone_seq'::regclass);


--
-- TOC entry 2773 (class 2604 OID 57538)
-- Name: vencimento id_vencimento; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vencimento ALTER COLUMN id_vencimento SET DEFAULT nextval('public.vencimento_id_vencimento_seq'::regclass);


--
-- TOC entry 2770 (class 2604 OID 16493)
-- Name: vendas id_venda; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas ALTER COLUMN id_venda SET DEFAULT nextval('public.vendas_id_venda_seq'::regclass);


--
-- TOC entry 2947 (class 0 OID 16417)
-- Dependencies: 207
-- Data for Name: bairros; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.bairros (id_bairro, nome_bairro, id_cidade) VALUES (25, 'Porto Velho', 39);
INSERT INTO public.bairros (id_bairro, nome_bairro, id_cidade) VALUES (26, 'Caidas D''Água', 27);
INSERT INTO public.bairros (id_bairro, nome_bairro, id_cidade) VALUES (27, 'Santo Antônio', 26);
INSERT INTO public.bairros (id_bairro, nome_bairro, id_cidade) VALUES (28, 'Rio Madeira', 26);
INSERT INTO public.bairros (id_bairro, nome_bairro, id_cidade) VALUES (29, 'Ciclo da Borracha', 36);
INSERT INTO public.bairros (id_bairro, nome_bairro, id_cidade) VALUES (30, 'Estação das Docas', 20);


--
-- TOC entry 2945 (class 0 OID 16404)
-- Dependencies: 205
-- Data for Name: cidades; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (14, 'Rio Branco', 16);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (15, 'Maceió', 17);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (16, 'Macapá', 18);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (17, 'Manuas', 19);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (18, 'Salvador', 20);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (19, 'Fortaleza', 21);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (20, 'Brasília', 22);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (21, 'Vitória', 23);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (22, 'Goiânia', 24);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (23, 'São luís', 25);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (24, 'Cuiabá', 26);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (25, 'Campo Grande', 27);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (26, 'Belo Horizonte', 28);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (27, 'Belém', 29);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (28, 'João Pessoa', 30);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (29, 'Curitiba', 31);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (30, 'Recife', 32);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (31, 'Terezina', 33);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (32, 'Rio de Janeiro', 36);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (33, 'Natal', 34);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (34, 'Porto Alegre', 35);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (35, 'Porto Velho', 37);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (36, 'Boa Vista', 38);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (37, 'Florianópolis', 39);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (38, 'São Paulo', 40);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (39, 'Aracaju', 41);
INSERT INTO public.cidades (id_cidade, nome_cidades, id_estado) VALUES (40, 'Palmas', 42);


--
-- TOC entry 2951 (class 0 OID 16438)
-- Dependencies: 211
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (17, 'Israel', 'Rua Nova', ' 999.999.999-99 ', ' 888.888.888-88 ', 27, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (19, 'Carlos Silva', 'Roma', ' 333.333.333-33 ', ' 666.666.666-66 ', 30, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (21, 'Emanoel ferreira', 'Sitio', ' 444.444.444-44 ', ' 555.555.555-55 ', 30, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (20, 'Emanoel ferreira da silva', 'Sitio fazenda', ' 444.444.444-44 ', ' 555.555.555-55 ', 29, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (22, 'Ana paula', 'Nova Cruz', ' 444.444.444-44 ', ' 444.444.444-44 ', 25, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (23, 'João beto', 'santa', ' 999.977.776-66 ', ' 555.444.333-22 ', 28, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (24, 'Joaõ neto', 'alto', ' 555.544.444-44 ', ' 222.222.222-22 ', 29, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (25, 'Mizael', 'baixo', ' 444.444.448-88 ', ' 333.332.222-22 ', 29, NULL);
INSERT INTO public.clientes (id_cliente, nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) VALUES (26, 'Osvaldo', 'Centro urbano', ' 334.442.777-77 ', ' 778.899.777-77 ', 28, NULL);


--
-- TOC entry 2943 (class 0 OID 16396)
-- Dependencies: 203
-- Data for Name: estados; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (16, 'ACRE', 'AC');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (17, 'ALAGOAS', 'AL');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (18, 'AMAPÁ', 'AP');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (19, 'AMAZONAS', 'AM');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (20, 'BAHIA', 'BA');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (21, 'CEARÁ', 'CE');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (22, 'DISTRITO FEDERAL(Brasília)', 'DF');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (23, 'ESPIRITO SANTO', 'ES');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (24, 'GOIÁS', 'GO');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (25, 'MARANHÃO', 'MA');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (26, 'MATO GROSSO', 'MT');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (27, 'MATO GROSSO DO SUL', 'MS');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (28, 'MINAS GERAIS', 'MG');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (29, 'PARÁ', 'PA');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (30, 'PARAÍBA', 'PB');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (31, 'PARANÁ', 'PR');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (32, 'PERNAMBUCO', 'PE');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (33, 'PIAUÍ', 'PI');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (34, 'RIO GRANDE DO NORTE', 'RN');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (35, 'RIO GRANDE DO SUL', 'RS');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (36, 'RIO DE JANEIRO', 'RJ');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (37, 'RONDÔNIA', 'RO');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (38, 'RORAIMA', 'RR');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (39, 'SANTA CATARINA', 'SC');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (40, 'SÃO PAULO', 'SP');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (41, 'SERGIPE', 'SE');
INSERT INTO public.estados (id_estado, nome_estado, sigla_estado) VALUES (42, 'TOCANTIS', 'TO');


--
-- TOC entry 2953 (class 0 OID 16456)
-- Dependencies: 213
-- Data for Name: fornecedores; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (3, 'israel', 'rua nova', 29, '0009988');
INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (4, 'celia ltda', 'nova olinda', 30, '00000000');
INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (5, 'Microsoft Ltda', 'rua100', 29, '0000999888');
INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (6, 'yahoo', 'rua Nova', 29, '1111111111');
INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (7, 'IS_Plataforma', 'Nova Cela', 29, '99.999.999/9999-99');
INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (8, 'Co_Sies Free', 'Centro/Urbano', 25, '88.888.888/7777-77');
INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (9, 'celia', 'Urbano', 29, '66.666.666/6666-66');
INSERT INTO public.fornecedores (id_fornecedor, nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor) VALUES (10, 'teste', 'teste', 29, '55.555.555/5555-55');


--
-- TOC entry 2959 (class 0 OID 16519)
-- Dependencies: 219
-- Data for Name: itens_tel_cli; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (19, 11);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (20, 10);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (21, 14);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (17, 14);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (22, 15);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (23, 10);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (24, 14);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (25, 11);
INSERT INTO public.itens_tel_cli (id_cliente, id_tel) VALUES (26, 14);


--
-- TOC entry 2958 (class 0 OID 16504)
-- Dependencies: 218
-- Data for Name: itens_tel_forn; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2960 (class 0 OID 16534)
-- Dependencies: 220
-- Data for Name: itens_venda_produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (51, 8, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (51, 7, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (54, 14, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (55, 15, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (56, 16, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (57, 13, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (58, 8, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (59, 15, 3);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (60, 9, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (61, 14, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (62, 8, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (63, 9, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (64, 14, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (65, 13, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (66, 15, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (67, 9, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (69, 9, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (110, 8, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (111, 15, 1);
INSERT INTO public.itens_venda_produto (id_venda, id_produto, quantidade_produto) VALUES (112, 7, 1);


--
-- TOC entry 2962 (class 0 OID 32959)
-- Dependencies: 222
-- Data for Name: login; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (1, 'israel pereira da silva', '123', 'Administrador', 'charlles', NULL);
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (2, 'carlos almeida campos', '123', 'Usuario', 'carlos', NULL);
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (3, 'testando 23', '123', 'Usuario', 'teste', NULL);
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (4, 'Empresa', '123456', 'Desenvolvedor', 'Empresa', NULL);
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (5, 'Ana Paula Pereira da Silva', '03AC674216F3E15C761EE1A5E255F067953623C8B388B4459E13F978D7C846F4', 'Administrador', 'Ana', NULL);
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (6, 'Israel Pereira da Silva', '31a73008a53934282fb4c3be52475aac', 'Administrador', 'israel', NULL);
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (7, 'Almeida', 'Sun Jan 17 15:16:11 BRT 2021@#$%!&¨*?', 'Administrador', 'almeida', '3c3e20ead5f8300d900a866cbb7e6613');
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (8, 'testando', '3c3e20ead5f8300d900a866cbb7e6613', 'Administrador', 'teste2', 'Sun Jan 17 15:20:05 BRT 2021@#$%!&¨*?');
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (9, 'Charlles Silva', 'A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3null', 'Administrador', 'admin', 'Mon Jan 18 18:00:46 BRT 2021@#$%!&¨*?');
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (10, 'Mizael', '202CB962AC59075B964B07152D234B70null', 'Administrador', 'usuario', 'Mon Jan 18 18:04:25 BRT 2021@#$%!&¨*?');
INSERT INTO public.login (id_login, nome_login, senha_login, permissao, login, salt_senha) VALUES (11, 'teste2', '96CAE35CE8A9B0244178BF28E4966C2CE1B8385723A96A6B838858CDD6CA0A1Enull', 'Administrador', 'tes', 'Mon Jan 18 18:29:02 BRT 2021@#$%!&¨*?');


--
-- TOC entry 2964 (class 0 OID 49370)
-- Dependencies: 224
-- Data for Name: parcela_vendas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.parcela_vendas (id_parc_venda, cod_venda, valor_venda, valor_total, numero_parcela, valor_parce, datavenc, estado) VALUES (1, 67, 50, 55, 1, 27.5, '15/01/2021', 'PG');
INSERT INTO public.parcela_vendas (id_parc_venda, cod_venda, valor_venda, valor_total, numero_parcela, valor_parce, datavenc, estado) VALUES (2, 67, 50, 55, 2, 27.5, '15/02/2021', 'PG');


--
-- TOC entry 2955 (class 0 OID 16474)
-- Dependencies: 215
-- Data for Name: produtos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (12, 'Computador Apple', 3000, 3300, 12, 3);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (16, 'celular apple', 1000, 1500, 127, 9);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (14, 'short', 30, 40, 117, 4);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (13, 'Camiseta', 20, 30, 93, 4);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (9, 'Tenis', 30, 50, 62, 8);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (11, 'Computador Microssft', 2500.5, 2550.99, 13, 5);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (8, 'Sapatos', 10, 20, 16, 4);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (15, 'sandalias', 5, 10, 44, 4);
INSERT INTO public.produtos (id_produto, nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) VALUES (7, 'computador', 1500.96, 2500.99, 8, 9);


--
-- TOC entry 2949 (class 0 OID 16430)
-- Dependencies: 209
-- Data for Name: telefones; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.telefones (id_telefone, numero_tel) VALUES (10, '(81)9988-7755');
INSERT INTO public.telefones (id_telefone, numero_tel) VALUES (11, '(83)8877-5566');
INSERT INTO public.telefones (id_telefone, numero_tel) VALUES (14, '(83)8115-4969');
INSERT INTO public.telefones (id_telefone, numero_tel) VALUES (15, '(15)8888-7777');


--
-- TOC entry 2966 (class 0 OID 57535)
-- Dependencies: 226
-- Data for Name: vencimento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.vencimento (id_vencimento, datavenc) VALUES (1, '15012021');
INSERT INTO public.vencimento (id_vencimento, datavenc) VALUES (3, '16012021');
INSERT INTO public.vencimento (id_vencimento, datavenc) VALUES (4, '1602');
INSERT INTO public.vencimento (id_vencimento, datavenc) VALUES (5, '20012021');
INSERT INTO public.vencimento (id_vencimento, datavenc) VALUES (6, '31122021');


--
-- TOC entry 2957 (class 0 OID 16490)
-- Dependencies: 217
-- Data for Name: vendas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (51, '20/12/2020', 2520.99, 17, NULL);
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (54, '14/01/2021', 40, 17, 'A vista');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (55, '14/01/2021', 10, 19, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (56, '14/01/2021', 1500, 21, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (57, '14/01/2021', 30, 20, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (58, '14/01/2021', 20, 23, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (59, '14/01/2021', 30, 20, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (60, '14/01/2021', 50, 17, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (61, '14/01/2021', 40, 17, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (62, '14/01/2021', 20, 17, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (63, '14/01/2021', 50, 24, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (64, '14/01/2021', 40, 22, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (65, '14/01/2021', 30, 23, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (66, '15/01/2021', 10, 22, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (67, '15/01/2021', 50, 19, 'Parcelado');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (69, '15/01/2021', 50, 25, 'A vista');
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (110, NULL, 0, NULL, NULL);
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (111, NULL, 0, NULL, NULL);
INSERT INTO public.vendas (id_venda, data_venda, valor_venda, id_cliente, tipo_pagamento) VALUES (112, NULL, 0, NULL, NULL);


--
-- TOC entry 2985 (class 0 OID 0)
-- Dependencies: 206
-- Name: bairros_id_bairro_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.bairros_id_bairro_seq', 31, true);


--
-- TOC entry 2986 (class 0 OID 0)
-- Dependencies: 204
-- Name: cidades_id_cidade_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cidades_id_cidade_seq', 41, true);


--
-- TOC entry 2987 (class 0 OID 0)
-- Dependencies: 210
-- Name: clientes_id_cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.clientes_id_cliente_seq', 30, true);


--
-- TOC entry 2988 (class 0 OID 0)
-- Dependencies: 202
-- Name: estados_id_estado_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.estados_id_estado_seq', 42, true);


--
-- TOC entry 2989 (class 0 OID 0)
-- Dependencies: 212
-- Name: fornecedores_id_fornecedor_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.fornecedores_id_fornecedor_seq', 10, true);


--
-- TOC entry 2990 (class 0 OID 0)
-- Dependencies: 221
-- Name: login_id_login_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.login_id_login_seq', 11, true);


--
-- TOC entry 2991 (class 0 OID 0)
-- Dependencies: 223
-- Name: parcela_vendas_id_parc_venda_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.parcela_vendas_id_parc_venda_seq', 2, true);


--
-- TOC entry 2992 (class 0 OID 0)
-- Dependencies: 214
-- Name: produtos_id_produto_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.produtos_id_produto_seq', 16, true);


--
-- TOC entry 2993 (class 0 OID 0)
-- Dependencies: 208
-- Name: telefones_id_telefone_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.telefones_id_telefone_seq', 15, true);


--
-- TOC entry 2994 (class 0 OID 0)
-- Dependencies: 225
-- Name: vencimento_id_vencimento_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.vencimento_id_vencimento_seq', 4, true);


--
-- TOC entry 2995 (class 0 OID 0)
-- Dependencies: 216
-- Name: vendas_id_venda_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.vendas_id_venda_seq', 112, true);


--
-- TOC entry 2797 (class 2606 OID 32964)
-- Name: login login_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (id_login);


--
-- TOC entry 2779 (class 2606 OID 16422)
-- Name: bairros pk_bairro; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairros
    ADD CONSTRAINT pk_bairro PRIMARY KEY (id_bairro);


--
-- TOC entry 2777 (class 2606 OID 16409)
-- Name: cidades pk_cidade; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cidades
    ADD CONSTRAINT pk_cidade PRIMARY KEY (id_cidade);


--
-- TOC entry 2783 (class 2606 OID 16443)
-- Name: clientes pk_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT pk_cliente PRIMARY KEY (id_cliente);


--
-- TOC entry 2775 (class 2606 OID 16401)
-- Name: estados pk_estado; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estados
    ADD CONSTRAINT pk_estado PRIMARY KEY (id_estado);


--
-- TOC entry 2791 (class 2606 OID 16508)
-- Name: itens_tel_forn pk_forn_tel; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_tel_forn
    ADD CONSTRAINT pk_forn_tel PRIMARY KEY (id_tel, id_forn);


--
-- TOC entry 2785 (class 2606 OID 16461)
-- Name: fornecedores pk_fornecedor; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fornecedores
    ADD CONSTRAINT pk_fornecedor PRIMARY KEY (id_fornecedor);


--
-- TOC entry 2799 (class 2606 OID 49378)
-- Name: parcela_vendas pk_parc; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.parcela_vendas
    ADD CONSTRAINT pk_parc PRIMARY KEY (id_parc_venda);


--
-- TOC entry 2787 (class 2606 OID 16482)
-- Name: produtos pk_produto; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produtos
    ADD CONSTRAINT pk_produto PRIMARY KEY (id_produto);


--
-- TOC entry 2795 (class 2606 OID 16538)
-- Name: itens_venda_produto pk_produto_venda; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_venda_produto
    ADD CONSTRAINT pk_produto_venda PRIMARY KEY (id_venda, id_produto);


--
-- TOC entry 2781 (class 2606 OID 16435)
-- Name: telefones pk_tel; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.telefones
    ADD CONSTRAINT pk_tel PRIMARY KEY (id_telefone);


--
-- TOC entry 2793 (class 2606 OID 16523)
-- Name: itens_tel_cli pk_tel_cli; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_tel_cli
    ADD CONSTRAINT pk_tel_cli PRIMARY KEY (id_cliente, id_tel);


--
-- TOC entry 2789 (class 2606 OID 16498)
-- Name: vendas pk_venda; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas
    ADD CONSTRAINT pk_venda PRIMARY KEY (id_venda);


--
-- TOC entry 2801 (class 2606 OID 57540)
-- Name: vencimento vencimento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vencimento
    ADD CONSTRAINT vencimento_pkey PRIMARY KEY (id_vencimento);


--
-- TOC entry 2805 (class 2606 OID 16449)
-- Name: clientes fk_bairro; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT fk_bairro FOREIGN KEY (id_bairro) REFERENCES public.bairros(id_bairro);


--
-- TOC entry 2806 (class 2606 OID 16462)
-- Name: fornecedores fk_bairro; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fornecedores
    ADD CONSTRAINT fk_bairro FOREIGN KEY (id_bairro) REFERENCES public.bairros(id_bairro);


--
-- TOC entry 2803 (class 2606 OID 16423)
-- Name: bairros fk_cidade; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairros
    ADD CONSTRAINT fk_cidade FOREIGN KEY (id_bairro) REFERENCES public.cidades(id_cidade);


--
-- TOC entry 2996 (class 0 OID 0)
-- Dependencies: 2803
-- Name: CONSTRAINT fk_cidade ON bairros; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON CONSTRAINT fk_cidade ON public.bairros IS 'chave estrangera de cidade';


--
-- TOC entry 2804 (class 2606 OID 16444)
-- Name: clientes fk_cidade; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT fk_cidade FOREIGN KEY (id_cidade) REFERENCES public.cidades(id_cidade);


--
-- TOC entry 2812 (class 2606 OID 16529)
-- Name: itens_tel_cli fk_cli; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_tel_cli
    ADD CONSTRAINT fk_cli FOREIGN KEY (id_cliente) REFERENCES public.clientes(id_cliente);


--
-- TOC entry 2808 (class 2606 OID 16499)
-- Name: vendas fk_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas
    ADD CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES public.clientes(id_cliente);


--
-- TOC entry 2802 (class 2606 OID 16410)
-- Name: cidades fk_estado; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cidades
    ADD CONSTRAINT fk_estado FOREIGN KEY (id_estado) REFERENCES public.estados(id_estado);


--
-- TOC entry 2997 (class 0 OID 0)
-- Dependencies: 2802
-- Name: CONSTRAINT fk_estado ON cidades; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON CONSTRAINT fk_estado ON public.cidades IS 'chave estrangera';


--
-- TOC entry 2810 (class 2606 OID 16514)
-- Name: itens_tel_forn fk_forn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_tel_forn
    ADD CONSTRAINT fk_forn FOREIGN KEY (id_forn) REFERENCES public.fornecedores(id_fornecedor);


--
-- TOC entry 2807 (class 2606 OID 16483)
-- Name: produtos fk_fornecedor; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produtos
    ADD CONSTRAINT fk_fornecedor FOREIGN KEY (id_fornecedor) REFERENCES public.fornecedores(id_fornecedor);


--
-- TOC entry 2815 (class 2606 OID 49379)
-- Name: parcela_vendas fk_parcela_venda_cod_venda; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.parcela_vendas
    ADD CONSTRAINT fk_parcela_venda_cod_venda FOREIGN KEY (cod_venda) REFERENCES public.vendas(id_venda);


--
-- TOC entry 2814 (class 2606 OID 24752)
-- Name: itens_venda_produto fk_produto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_venda_produto
    ADD CONSTRAINT fk_produto FOREIGN KEY (id_produto) REFERENCES public.produtos(id_produto) NOT VALID;


--
-- TOC entry 2809 (class 2606 OID 16509)
-- Name: itens_tel_forn fk_tel; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_tel_forn
    ADD CONSTRAINT fk_tel FOREIGN KEY (id_tel) REFERENCES public.telefones(id_telefone);


--
-- TOC entry 2811 (class 2606 OID 16524)
-- Name: itens_tel_cli fk_tel; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_tel_cli
    ADD CONSTRAINT fk_tel FOREIGN KEY (id_tel) REFERENCES public.telefones(id_telefone);


--
-- TOC entry 2813 (class 2606 OID 24757)
-- Name: itens_venda_produto fk_vendas; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itens_venda_produto
    ADD CONSTRAINT fk_vendas FOREIGN KEY (id_venda) REFERENCES public.vendas(id_venda) NOT VALID;


-- Completed on 2021-02-21 12:08:24

--
-- PostgreSQL database dump complete
--

