# Write your MySQL query statement below
select firstName,lastName,city,state
from person
Left join Address on person.personId = Address.personId;
