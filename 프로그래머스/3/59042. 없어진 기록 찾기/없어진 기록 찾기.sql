select
    animal_id, name
from
    animal_outs aout
where
    not exists(
        select 1
        from animal_ins
        where animal_id = aout.animal_id
    )
order by animal_id;