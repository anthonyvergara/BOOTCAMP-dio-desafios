SELECT nome,
		(SELECT COUNT(*) FROM ordem_servico os
		INNER JOIN status_ordem_servico st ON os.id = st.ordem_servico_id
		WHERE os.cliente_id = cliente.id AND st.tipo_status = 3)
		AS ordem_servico_agendada,
		
		(SELECT SUM(valor_total) FROM ordem_servico
		WHERE cliente_id = cliente.id)
		AS VALOR_TOTAL
FROM cliente
ORDER BY ordem_servico_agendada;