CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    desc TEXT,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP NOT NULL,
    url VARCHAR(255)
);

INSERT INTO Content (title, desc, status, content_type, date_created, date_updated, url) VALUES
('Sample Article', 'This is a sample article description.', 'published', 'article', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'http://example.com/sample-article'),
('Sample Video', 'This is a sample video description.', 'draft', 'video', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'http://example.com/sample-video');