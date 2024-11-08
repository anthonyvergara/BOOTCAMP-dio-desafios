SELECT * FROM ordem_servico os
JOIN cliente cl ON os.cliente_id = cl.id
WHERE cl.sobrenome LIKE '%Santana%';
