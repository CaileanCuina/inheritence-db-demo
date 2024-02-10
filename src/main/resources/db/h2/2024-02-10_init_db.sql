create table animal_base
(
    animal_base_id int identity
        constraint pk_document_type_id
            primary key,
    type      nvarchar(20),
    name             nvarchar(50),
    age              int
)
;