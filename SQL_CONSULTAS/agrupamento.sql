SELECT COUNT(*) AS qtd_pagamento, ordem_servico_id AS ordem_servico FROM pagamento
GROUP BY ordem_servico_id
ORDER BY qtd_pagamento DESC;