-- Database: tasks

-- DROP DATABASE IF EXISTS tasks;

CREATE DATABASE alunos
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

    -- Table: public.categoria

-- DROP TABLE IF EXISTS public.categoria;

CREATE TABLE IF NOT EXISTS public.categoria
(
    id integer NOT NULL DEFAULT nextval('categoria_id_seq'::regclass),
    nome character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT categoria_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.categoria
    OWNER to postgres;

-- Table: public.task

-- DROP TABLE IF EXISTS public.task;

CREATE TABLE IF NOT EXISTS public.aluno
(
    id bigint NOT NULL,
    nome character varying COLLATE pg_catalog."default",
    curso character varying COLLATE pg_catalog."default",
    cidade character varying COLLATE pg_catalog."default",
    nomeMae character varying COLLATE pg_catalog."default",
    NomePai character varying COLLATE pg_catalog."default",
    categoria_id integer,
    CONSTRAINT aluno_pkey PRIMARY KEY (id),
    CONSTRAINT fk_aluno_categoria FOREIGN KEY (categoria_id)
        REFERENCES public.categoria (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT aluno_categoria_id_fkey FOREIGN KEY (categoria_id)
        REFERENCES public.categoria (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.aluno
    OWNER to postgres;